package com.icanx.jvm.OOM.garbage;

import java.util.ArrayList;
import java.util.List;

/*

GC
Garbage  Collection

工作空间是 堆空间(Heap) 和 永久区(perm gen)

古老的垃圾收集算法

引用计数法:  对象使用一次 +1 释放一次-1  Java没有使用
标记-清除算法：是现代垃圾回收算法的思想基础。
               标记-清除算法将垃圾回收分为两个阶段：标记阶段和清除阶段。
               一种可行的实现是，在标记阶段，首先通过根节点，标记所有从根节点开始的可达对象。因此，未被标记的对象就是未被引用的垃圾对象。然后，在清除阶段，清除所有未被标记的对象。

标记-压缩算法：适合用于存活对象较多的场合，
               如老年代。它在标记-清除算法的基础上做了一些优化。和标记-清除算法一样，
               标记-压缩算法也首先需要从根节点开始，对所有可达对象做一次标记。但之后，它并不简单的清理未标记的对象，而是将所有的存活对象压缩到内存的一端。之后，清理边界外所有的空间。

复制算法：将原有的内存空间分为两块，每次只使用其中一块，在垃圾回收时，将正在使用的内存中的存活对象复制到未使用的内存块中，
		  之后，清除正在使用的内存块中的所有对象，交换两个内存的角色，完成垃圾回收



可触及的：
	从根节点可以触及到这个对象

	根：
		栈中引用的对象
		方法区域

可复活的：
	一旦所有引用被释放，就是可复活状态
	因为在finalize()中可能复活该对象
不可触及的:
	在finalize()后，可能会进入不可触及状态
	不可触及的对象不可能复活
	可以回收


Stop-The-World



*
* */
public class TestGarbage {

	static List list = new ArrayList<Object>();
	public static void main(String[] args) {
//		 byte[] b = new byte[1*1024*1024];
//		System.out.println("分配了4M空间给数组！！！");

		System.out.print("Xmx=");
		System.out.println(Runtime.getRuntime().maxMemory()/1024.0/1024+"M");
		System.out.print("free mem=");
		System.out.println(Runtime.getRuntime().freeMemory()/1024.0/1024+"M");
		System.out.print("total mem=");
		System.out.println(Runtime.getRuntime().totalMemory()/1024.0/1024+"M");
//		while(true){
//			list.add(new Object());
//			System.out.print("    free mem=");
//			System.out.println(Runtime.getRuntime().freeMemory()/1024.0/1024+"M");
////			System.out.print("    Total mem=");
////			System.out.println(Runtime.getRuntime().totalMemory()/1024.0/1024+"M");
//
//		}
		

		
	}
}
