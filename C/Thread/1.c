#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <zconf.h>

pthread_mutex_t mutex = PTHREAD_MUTEX_INITIALIZER;
// A normal C function that is executed as a thread
// when its name is specified in pthread_create()
void *myThreadFunc(void *vargp)
{
   sleep(1); // to give one second break for each thread else all the threads will execute randomly
   int i;
   static int var = 1; /*Shared varible for all the thread*/
   static int th = 1; /* Index to track threads */
  
   for(i = 0; i < 5; ++i) /* Loop to increament and print shared varible by each thread*/
   {
    pthread_mutex_lock(&mutex);
       printf("Printing from Thread %d with shared variable value %d\n",th, var++);
        pthread_mutex_unlock(&mutex);
   }
  
   th++;
   return NULL;
}

int main()
{
   int i = 0;
   pthread_t thread_id[5]; /*Array to hold thread_id which are used to handle each thread*/
   printf("Before Thread\n");

   for(i = 0; i < 5; ++i) /* Loop to start new threads */
       pthread_create(&thread_id[i], NULL, myThreadFunc, NULL); /* pthread_create is a standard function to create new thread*/

   for(i = 0; i < 5; ++i)
       pthread_join(thread_id[i], NULL); /* This is used to wait for the thread to execute completely*/

   printf("After all Threads\n");
   exit(0);
}
