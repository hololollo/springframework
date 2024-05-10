package com.spring3.service;

import java.util.List;

import com.spring3.dto.Sample;

public interface SampleService {
	public List<Sample> getSampleList();
	public int maxNum();
	public Sample getSample(int num);
	public void insSample(Sample sample);
	public void upSample(Sample sample);
	public void delSample(Sample sample);
}
