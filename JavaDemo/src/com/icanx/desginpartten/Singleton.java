package com.icanx.desginpartten;

public class Singleton {
	
	/*
	 //////////////////////////V  饿汉式   ///////////////////////////
		//第一步：屏蔽构造方法   堵住来源   
		private Singleton() {}
		//第二步：优势 天生安全， 缺点如果对象较大 可能比较耗时 可以忽略
		private static final Singleton singleton = new Singleton();
		public static Singleton  getSingleton() {
			return singleton;
		}
	*/
	/*//////////////////////////V  懒汉式1.0///////////////////////////
	//第一步：屏蔽构造方法   堵住来源   
	private Singleton() {}
	//第二步：声明静态 变量  属于类 而不是属于 某一个方法
	private static  Singleton singleton =null;
	public static Singleton  getSingleton() {
		if (singleton == null)
		 singleton = new Singleton();
		return singleton;
	}*/
	 //////////////////////////V  饿汉式 2.0///////////////////////////
	//第一步：屏蔽构造方法   堵住来源   
/*	private Singleton() {}
	//第二步：优势 天生安全， 缺点如果对象较大 可能比较耗时 可以忽略
	private static  Singleton singleton =  null;
	//第三步：考虑 线程安全 问题 在 synchronized方法上加  synchronized同步锁
	public static synchronized  Singleton  getSingleton() {
		if(singleton==null){
			singleton = new Singleton();
		}
		return singleton;
	}
	*/
	
	
	 //////////////////////////V  饿汉式 3.0 优化同步方法///////////////////////////
	//第一步：屏蔽构造方法   堵住来源   
/*	private Singleton() {}
	//第二步：创建对象
	private static  Singleton singleton =  null;
	//第三步：考虑到只需初始化的时候加锁，别的时候只返回对象即可。 初始化的同时再判断一次对象是否初始化。
	public static  Singleton  getSingleton() {
		if(singleton==null){
			synchronized(Singleton.class){
				if(singleton==null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	*/
	
		//第一步：屏蔽构造方法   堵住来源   
		private Singleton() {}
		//利用匿名内部类
		private static class LazySinleton{
			private static final Singleton singleton =  new Singleton();
		}
		public static Singleton getSingleton() {
			return LazySinleton.singleton;
		}
		
		
		
//	public class Singleton {
//		private static Singleton instance = null;
//
//		private Singleton() {
//		}
//
//		public static Singleton getInstance() {
//			if (instance == null) {
//				synchronized (Singleton.class) {
//					if (instance == null) {
//						instance = new Singleton();
//					}
//				}
//			}
//			return instance;
//		}
//	}
	
}
