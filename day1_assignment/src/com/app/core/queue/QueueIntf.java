package com.app.core.queue;


public interface QueueIntf {
	public void AddQ(int elem);
	public int DeleteQ();
	public boolean IsEmpty();
	public boolean IsFull();
}
