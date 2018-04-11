package com.coderbd.service;

import com.coderbd.entity.global.GlobalShift;

public interface GlobalShiftService {

	public void create(GlobalShift globalShift);

	public void update(GlobalShift globalShift);

	public void delete(GlobalShift globalShift);

	public Iterable<GlobalShift> findAll();


}
