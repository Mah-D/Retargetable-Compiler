/***********************************************************************************
 * dupvids.h
 * Dup Video Splice
 * 
 * All the functions that are used for stitching videos together
 * in Craig Ritzdorf's video confrencing filters for dup.
 *
 * January 29, 2009
 ***********************************************************************************/
//might add a length attribute
struct PicGrid{
	char *grid;
	int width;
	int hight;
	int picWidth;
	int picHight;
	int complete;
};


#define RowLength(GridWidth, PicWidth) (3*(GridWidth)*(PicWidth))
#define RowOffset(GridColumn, PicWidth) (3*(GridColumn)*(PicWidth))

//the following inline function is my idea of a good comprimise between read ability and speed.
//after writing it in code form I now doubt the readablility part of that and will soon just cut out the crap (aka the macros)
//and simplify the equation.
inline char *PicRowOffset(struct PicGrid *pics, int picnum, int rownum){
	return  pics->grid + (picnum/pics->width)*RowLength(pics->width,pics->picWidth)*pics->picHight + (RowLength(pics->width,pics->picWidth)*rownum)+RowOffset((picnum%pics->width),pics->picWidth);
}
void gridInsert(char * pic, int picnum, struct PicGrid *picGrid);
struct PicGrid *createGrid(int numOfPics, int picWidth, int picHight);
