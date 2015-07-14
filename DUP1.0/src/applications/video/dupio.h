/***********************************************************************************
 * dupio.h
 * All the functions that are used for reading and writing 
 * in Craig Ritzdorf's video confrencing filters for dup.
 *
 * January 29, 2009
 ***********************************************************************************/
#include <sys/types.h>
#include <sys/select.h>

struct JpgBuff{
	short complete;
	char *buf;
	char *jpg;
	int bufflength;
	int jpglength;
	int offset;
};

struct Image{
	char *img;
	int width;
	int height;
};

int read_all(int fd, char* buf, size_t size);
void read_jpg(int fd, struct JpgBuff *jbuf, short recent);
int write_all(int fd, const char* buf, size_t size);
int get_fd(int fd);
int get_fd_list(int lowfd, int *list, fd_set *fds);
