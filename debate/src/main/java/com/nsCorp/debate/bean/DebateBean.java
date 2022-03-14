package com.nsCorp.debate.bean;

import lombok.Data;

@Data
public class DebateBean {

	private String speech;
	private int duration;
	private String language;

	public DebateBean() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public DebateBean(String speech, int duration, String language) {
		super();
		this.speech = speech;
		this.duration = duration;
		this.language = language;
	}

	public void Speech() {
		System.out.println("Debate of " + this.speech + " for " + this.duration + " min in "+this.language.charAt(duration));
	}

}
