package com.aurionpro.model;

import java.util.Set;

public interface IReadable {

	public Set<GeographicalArea> dataReader(String filename);
}
