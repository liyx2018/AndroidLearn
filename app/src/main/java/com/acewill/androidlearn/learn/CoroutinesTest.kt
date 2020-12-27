package com.acewill.androidlearn.learn

import kotlinx.coroutines.*

fun main() {

    //只在测试环境使用，正式环境会产生性能上的问题
    runBlocking {
        //子协程
        launch {
            println("launch1")
            print("当前launch1协程所在的线程："+Thread.currentThread().id+"\n")

            getsUspendName()

        }

        launch {
            println("launch2")
            print("当前launch2协程所在的线程："+Thread.currentThread().id+"\n")

        }
        delay(5000)//非阻塞式的挂起函数，只会挂起当前协程
        print("当前runBlocking协程所在的线程："+Thread.currentThread().id+"\n")

        //获取执行结果
        val result=async {
            100
        }.await()
        println(result)

        //withContext作用域构造器


    }

    //每次创建的都是顶层协程，也不建议使用
    val job = GlobalScope.launch {

        delay(500)//非阻塞式的挂起函数，只会挂起当前协程
        print("当前GlobalScope.launch协程所在的线程："+Thread.currentThread().id+"\n")
    }
    job.cancel()
    Thread.sleep(1000)
    print("主线程："+Thread.currentThread().id)

    //实际项目中经常使用的方式
    val job1 = Job()
    val scope =CoroutineScope(job1)
    scope.launch {

    }
    job1.cancel()

}

//suspend关键字可以声明成挂起函数，无法提供协程作用域（coroutinesscope可以）
suspend fun getsUspendName() {
    delay(100)

    //coroutineScope特点：会继承外部的协程作用域并创建一个子作用域  可以阻塞当前协程，不影响其他协程，也不影响其他线程
    coroutineScope {

        launch {



        }

    }


   println("--------getsUspendName-------")
}
