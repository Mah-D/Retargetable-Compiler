#include "../inc/async.h"

enum { SYNC1=1010, SYNC2=211, SYNC3=1232 };

void async3(void* params) {
	int* y = (int *)params;
	fprintf(stderr, "The final value of y at place 0 is: %d\n", *y);
}

void async2(void* params) {
	task_create();
	{
		int* y = (int *)params;
		fprintf(stderr, "The final value of y at place 0 is: %d\n", *y);
		int* z = (int *) malloc(sizeof(int));
		*z = *y + 1;
		_async a;
		a.method = SYNC3;
		a.size = sizeof(int);
		a.params = (void *)z;
		task_dispatch(a, _toplace(0));
	}
	task_destroy();
	int i;
	for(i=0;i<3;i++)
	{
		int* y = (int *)params;
		fprintf(stderr, "The final value of y at place 0 is: %d\n", *y);
		int* z = (int *) malloc(sizeof(int));
		*z = *y + 1;
		_async a;
		a.method = SYNC3;
		a.size = sizeof(int);
		a.params = (void *)z;
		task_dispatch(a, _toplace(i));
		//if(i==1) sleep(10);
	}
}

void async1(void * params) {
	{
		fprintf(stderr, "1:Async One Started\n");
		int* x = (int *)params;
		int* y = (int *) malloc(sizeof(int));
		*y = *x + 1;
		_async a;
		a.method = SYNC2;
		a.size = sizeof(int);
		a.params = (void *)y;
		task_dispatch(a, _toplace(0)); 
	}
}

void _thread_run(unsigned long method, void * params) {
	
	fprintf(stderr, "0:Thread Run Started\n");
	switch(method) {
		case SYNC1:
			async1(params);	
			break;
		case SYNC2:
			async2(params);
			break;
		case SYNC3:
			async3(params);
			break;
		default: 
		fprintf(stderr, "0:Async One Started\n");
			break;
	}
}

void m() {
	{
		
		fprintf(stderr, "0:M Started\n");
		int *x = malloc(sizeof(int));
		*x = 10;
 		_async a;
		a.method = SYNC1;
		a.size = sizeof(int);
		a.params = (void*)x;
		task_dispatch(a, _toplace(1));
		fprintf(stderr, "0:M Finished\n");
	}	
}

_run_main() {
	fprintf(stderr, "0:RunMain Started\n");
	task_start_finish();
	m();
	task_end_finish();
	fprintf(stderr, "0:RunMain Finished\n");
}
