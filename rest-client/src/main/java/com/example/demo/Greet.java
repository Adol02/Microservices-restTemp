package com.example.demo;



public class Greet {
      private String msg;
      public Greet() {
          // required for deserialization
      }
	public Greet(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
       
}
