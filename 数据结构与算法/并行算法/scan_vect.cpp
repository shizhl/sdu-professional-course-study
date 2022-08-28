//student name:
//id number:

#include <omp.h>
#include <stdlib.h>
#include <assert.h>
#include <vector>
#include <iostream>
using namespace std;


// add your codes start
int num_thrd=30;
void add_sum(vector<int> &a,int n){
  if(n==1)
  return;


  vector<int> b(n/2,0);
  #pragma omp parallel num_threads(num_thrd)
  {
    int id=omp_get_thread_num();
    int nthrds=omp_get_num_threads();
    int start=id*n/nthrds;
    int end=(id+1)*n/nthrds;
    if(id==nthrds-1){
      end=n;
    }
    for(int i=start+start%2;i<end;i+=2){
      b[i/2]=a[i]+a[i+1];
    }
  }
  add_sum(b,n/2);
  
  #pragma omp parallel num_threads(num_thrd)
  {
    int id=omp_get_thread_num();
    int nthrds=omp_get_num_threads();
    int margin=n/nthrds;
    int start=id*margin;
    int end=(id+1)*margin;
    if(id==nthrds-1){
      end=n;
    }
    start=max(start,2);
    for(int i=start+start%2;i<end;i+=2){
      a[i]+=b[i/2-1];
      a[i-1]=b[(i-1)/2];
    }
  }
  if((n-1)%2==1){
    a[n-1]=b[(n-1)/2];
  }
 
}
// add your codes end


int main() {
  vector<int> data(SIZE, 1);
  data[0] = 0;

  double t = omp_get_wtime();
  // add your codes start
        add_sum(data,SIZE);
  // add your codes end
  t = omp_get_wtime() - t;
  printf("time %f %d\n", t, SIZE);

  for (int i = 0; i < SIZE; i++) assert(data[i] == i);
}
