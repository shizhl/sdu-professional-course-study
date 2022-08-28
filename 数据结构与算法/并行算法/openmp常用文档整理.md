[toc]

# OpenMp常用文档整理

### 简单的实例

```cpp
#pragma omp parallel
{
    int ID=omp_get_thread_num(); //得到一个新的线程的ID
    printf("hello (%d)",ID);
    printf("world (%d)\n",ID);
}
```



### k个线程同时处理无依赖的数据

for制导语句是将for循环分配给各个线程执行，这里**要求数据不存在依赖**

```cpp
#define NUM_TRREADS 60
...
    
omp_set_num_threads(NUM_TRREADS); //申请线程数量
#pragma omp_parallel for
{
    int id=omp_get_thread_num();  //得到当前线程的id
    int num=omp_get_num_threads();//获取实际得到的线程的数量 
    for(int i=id;i<=N;i+=num){   //每一个线程处理第id+x*k个数据（k=1,2,3...)
        ...
    }
}
```

第二种写法??

```cpp
#define NUM_TRREADS 60
...
    
omp_set_num_threads(NUM_TRREADS);
#pragma omp_parallel
{
    int id = omp_get_thread_num();
    int num = omp_get_num_threads();
    #pragma omp for   //后面不要再加上{}了
    for (int i = id; i <= N; i += num)
    {
        if (isPrime(i))
        {
            prime.push_back(i);
        }
    }
}
```

