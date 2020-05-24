package com.udemy.multithreading.forkJoin.main;

import java.util.concurrent.ForkJoinPool;

import com.udemy.multithreading.forkJoin.RecursiveAction.SimpleRecursiveAction;

public class RecursiveActionApp {
	/*
	 * fork() asynchronously execute the given task is the pool 
	 * 		We can call this on RecursiveAction or RecursiveTask<T>
	 * 
	 * join() returns the result of the computation when it is done
	 * 
	 * 
	 * invoke() execute the given task + return its result upon completion
	 */

	public static void main(String[] args) {
		
		ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveAction simpleRecursiveAction = new SimpleRecursiveAction(120);
		pool.invoke(simpleRecursiveAction);
		

	}

}
