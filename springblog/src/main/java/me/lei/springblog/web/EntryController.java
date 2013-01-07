package me.lei.springblog.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import me.lei.springblog.domain.Category;
import me.lei.springblog.domain.Entry;
import me.lei.springblog.domain.Visibility;
import me.lei.springblog.service.CategoryService;
import me.lei.springblog.service.EntryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EntryController {
	private EntryService entryService;
	private CategoryService categoryService;

	@Autowired
	public EntryController(EntryService entryService,
			CategoryService categoryService) {
		super();
		this.entryService = entryService;
		this.categoryService = categoryService;
	}

	@RequestMapping(value={"/index","/"})
	public String list(Model model){
		List<Entry> entries=entryService.findAll();
		model.addAttribute("entries", entries);
		return "entry/list";
	}

	@RequestMapping(value={"/admin/entry/create","/admin"},method=RequestMethod.GET)
	public String createForm(Model model){
		//下拉菜单数据源
		List<Category> categories=categoryService.findAll();
		
//		Map<String,Integer> map=new HashMap<String,Integer>();
//		map.put(Visibility.All.getMessage(),Visibility.All.ordinal());
//		map.put(Visibility.Owner.getMessage(),Visibility.Owner.ordinal());
		
		model.addAttribute("categories", categories);
		model.addAttribute("entry",new Entry());
		model.addAttribute("visibility", Visibility.options());
		
		return "entry/create";
	}
	
	@RequestMapping(value="/admin/entry/create",method=RequestMethod.POST)
	public String save(Entry entry){
		entry.setPostDate(new Date());
		entryService.add(entry);
		return "redirect:/";
	}
	
	@RequestMapping(value="/entry/item")
	public String item(Model model,int id){
		Entry entry=entryService.find(id);
		model.addAttribute("entry", entry);
		return "entry/item";
	}
	
	@RequestMapping(value="/admin/entry/uploadimg",method=RequestMethod.POST)
	public String uploadImg(HttpServletRequest request,HttpServletResponse response, @RequestParam(value="upload", required=false) Part file) throws IOException{
//		SimpleDateFormat format=new SimpleDateFormat("yyyyMMddHHmmssSSS");
//		String newFileName=format.format(new Date())+file.getContentType();
		
		InputStream inputStream = file.getInputStream();
		
		File imgDir=new File(request.getServletContext().getRealPath("/") + File.separator+"upload");
		if(!imgDir.exists())
			imgDir.mkdir();
		
		File newFile=new File(imgDir,"1.jpg");
        OutputStream outputStream = new FileOutputStream(newFile);

        int readBytes = 0;
        byte[] buffer = new byte[10000];
        while ((readBytes = inputStream.read(buffer, 0, 10000)) != -1) {
                outputStream.write(buffer, 0, readBytes);
        }
        outputStream.close();
        inputStream.close();
        

//        if (file.getContentType().contains("image")){// 仅处理上传的图像文件
//            ApplicationPart appPart = (ApplicationPart) file;
//            String fname1 = ap.getFilename();// 取得上传的文件名如C:\Users\Public\Pictures\Sample Pictures\Desert.jpg
//            int path_idx = fname1.lastIndexOf("\\") + 1;
//            String fname2 = fname1.substring(path_idx, fname1.length());// 提取文件名Desert.jpg
//            p.write(path + fname2); // 写入 web 项目根路径下
//            System.out.println(fname2);
//            System.out.println(p.getContentType());
//        }
        

        PrintWriter out=response.getWriter();
        
		String callback = request.getParameter("CKEditorFuncNum");
		out.println("<script type=\"text/javascript\">");
		out.println("window.parent.CKEDITOR.tools.callFunction(" + callback
				+ ",'" + "/springblog/upload/"+"1.jpg" + "',''" + ")");
		out.println("</script>");
		out.flush();
		out.close();
        
		//file.write(file.getName());
		return null;
	}
}
