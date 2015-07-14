#ifndef RELAYH_
#define RELAY_H_
#include "tpl.h"
#include "errormsg.h"
#include <fcntl.h>
int _init_relay();
void *_faninany_start(void * _rec_from);
#endif /* RELAY_H_ */
