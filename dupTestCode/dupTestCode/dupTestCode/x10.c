#include "../inc/async.h"

enum { ASYNC1, ASYNC2 }

void async2(void * params) {
	int* y = (int *)params;
	fprintf(stderr, "The final value of y at place 0 is: %d", *y);
}

void async1(void * params) {
	{
		int* x = (int *)params;
		int* y = (int *) malloc(sizeof(int));
		*y = *x + 1;
		_async a;
		a.method = ASYNC2;
		a.size = sizeof(int);
		a.params = (void *)y;
		task_dispatch(a, _toplace(0)); 
	}
}

void thread_run(unsigned long method, void * params) {
	switch(method) {
		case ASYNC1:
			async1(params);	
			break;
		case ASYNC2:
			async2(params);
			break;
		default: break;
	}
}

void m() {
	{
		int *x = malloc(sizeof(int));
		*x = 10;
 		_async a;
		a.method = ASYNC1;
		a.size = sizeof(int);
		a.params = (void *)x;
		task_dispatch(a, _toplace(1));
	}	
}

_run_main() {
	task_create();
	m();
	task_destroy();
}
