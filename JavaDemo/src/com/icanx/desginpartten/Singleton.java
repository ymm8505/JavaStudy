package com.icanx.desginpartten;

public class Singleton {
	
	/*
	 //////////////////////////V  ����ʽ   ///////////////////////////
		//��һ�������ι��췽��   ��ס��Դ   
		private Singleton() {}
		//�ڶ��������� ������ȫ�� ȱ���������ϴ� ���ܱȽϺ�ʱ ���Ժ���
		private static final Singleton singleton = new Singleton();
		public static Singleton  getSingleton() {
			return singleton;
		}
	*/
	/*//////////////////////////V  ����ʽ1.0///////////////////////////
	//��һ�������ι��췽��   ��ס��Դ   
	private Singleton() {}
	//�ڶ�����������̬ ����  ������ ���������� ĳһ������
	private static  Singleton singleton =null;
	public static Singleton  getSingleton() {
		if (singleton == null)
		 singleton = new Singleton();
		return singleton;
	}*/
	 //////////////////////////V  ����ʽ 2.0///////////////////////////
	//��һ�������ι��췽��   ��ס��Դ   
/*	private Singleton() {}
	//�ڶ��������� ������ȫ�� ȱ���������ϴ� ���ܱȽϺ�ʱ ���Ժ���
	private static  Singleton singleton =  null;
	//������������ �̰߳�ȫ ���� �� synchronized�����ϼ�  synchronizedͬ����
	public static synchronized  Singleton  getSingleton() {
		if(singleton==null){
			singleton = new Singleton();
		}
		return singleton;
	}
	*/
	
	
	 //////////////////////////V  ����ʽ 3.0 �Ż�ͬ������///////////////////////////
	//��һ�������ι��췽��   ��ס��Դ   
/*	private Singleton() {}
	//�ڶ�������������
	private static  Singleton singleton =  null;
	//�����������ǵ�ֻ���ʼ����ʱ����������ʱ��ֻ���ض��󼴿ɡ� ��ʼ����ͬʱ���ж�һ�ζ����Ƿ��ʼ����
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
	
		//��һ�������ι��췽��   ��ס��Դ   
		private Singleton() {}
		//���������ڲ���
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
