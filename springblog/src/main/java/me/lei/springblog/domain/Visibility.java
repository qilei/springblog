package me.lei.springblog.domain;

import java.util.HashMap;
import java.util.Map;

public enum Visibility {
	All("所有人可见"), Owner("仅自己可见");

	private String message;

	Visibility(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

    public static Map<Visibility, String> options() {
        Map<Visibility, String> options = new HashMap<Visibility, String>();
        for (Visibility type : values()) {
            options.put(type, type.getMessage());
        }
        return options;
    }
}
