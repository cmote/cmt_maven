package com.cmote.cmt_jfinal;

import org.beetl.ext.jfinal.BeetlRenderFactory;

public class MyBeetlRenderFactory extends BeetlRenderFactory {
	@Override
	public Render getRender(String view) {
		BeetlRender render = new BeetlRender(groupTemplate, view);
		return render;
	}

	@Override
	public String getViewExtension() {
		return ".html";
	}
}
