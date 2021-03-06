/** In order to get a better solution video
	I chose mid-term-1 in Spring 2018 instead of mid-term-1 in Spring 2017.
	This is Part 4 Sans (b) in spring 2018.
	
	@author Jonathan Wang.
	*/
public static IntList ilsans(IntList x, int y) {
	if (x == null) {
		return null;
	}
	if (x.first == y) {
		return ilsans(x.rest, y);
	}
	return new IntList(x.first, ilsans(x.rest, y));
}