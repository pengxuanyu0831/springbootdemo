package com.pengxy.demo;

import net.bytebuddy.description.field.FieldDescription;

import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {
    private static final Integer MAX = 100;
    static class ForkJoinTask extends RecursiveTask<Integer>{
        private Integer startValue;
        private Integer endValue;

        public class ForkJointask(Integer startValue,Integer  endValue){
            this.endValue = endValue;
            this.startValue = startValue;
        }
        @Override
        protected Integer compute() {
            return null;
        }
    }
}
