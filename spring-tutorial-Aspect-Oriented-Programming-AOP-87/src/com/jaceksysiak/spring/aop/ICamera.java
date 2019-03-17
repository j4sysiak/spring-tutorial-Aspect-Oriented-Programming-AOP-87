package com.jaceksysiak.spring.aop;

public interface ICamera {

	public abstract void snap() throws Exception;

	public abstract void snap(int exposure);

	public abstract String snap(String name);

	public abstract void snapNighttime();

	public abstract void snapCar(Car car);

	public abstract void snap(double exposure);

	public abstract void snap(int i, double exposure);

}