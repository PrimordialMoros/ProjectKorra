package com.projectkorra.projectkorra.configuration.better.configs.commands;

import com.projectkorra.projectkorra.configuration.better.Config;

public abstract class CommandConfig implements Config {

	public final String Description;
	
	public CommandConfig(String description) {
		Description = description;
	}

	@Override
	public String[] getParents() {
		return new String[] { "Commands" };
	}

}