package com.udemy.multithreading.forkJoin.main;

import java.util.concurrent.ForkJoinPool;

import com.udemy.multithreading.forkJoin.RecursiveAction.SimpleRecursiveTask;

public class RecursiveTaskApp {

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
		SimpleRecursiveTask task = new SimpleRecursiveTask(120);
		
		
		System.out.println(forkJoinPool.invoke(task));

	}

}
