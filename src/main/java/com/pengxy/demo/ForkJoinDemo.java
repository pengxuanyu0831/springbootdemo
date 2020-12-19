package com.pengxy.demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {
    private static final Integer MAX = 100;
    static class ForkJoinTask<I extends Number> extends RecursiveTask<Integer>{
        private Integer startValue;
        private Integer endValue;

        public ForkJoinTask(Integer startValue, Integer endValue){
            this.endValue = endValue;
            this.startValue = startValue;
        }
        @Override
        protected Integer compute() {
            if(endValue - startValue <= MAX){
                System.out.println("任务拆分 。。。 "+" 当前线程为: " + Thread.currentThread().getName() +" startValue:" + startValue + " endvalue： "+ endValue );
                Integer totalValue = 0;
                for(int index = this.startValue ;index <= endValue; index++ ){
                    totalValue += index;
                }
                return totalValue;
            }
            else {
                ForkJoinTask<Number> taskA = new ForkJoinTask<Number>(startValue,(startValue + endValue)/2);
                taskA.fork();
                ForkJoinTask<Number> taskB = new ForkJoinTask<Number>((startValue + endValue)/2 , endValue);
                taskB.fork();
                return taskA.join() + taskB.join();
            }
        }
    }

    public static void main(String[] args){
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> taskFuture = (ForkJoinTask<Integer>) forkJoinPool.submit(new ForkJoinTask<Number>(1,1001));
        try{
            Integer resule = taskFuture.get();
            System.out.println("result = " + resule);
        } catch (InterruptedException | ExecutionException e ) {
            e.printStackTrace();
        }
    }
}
