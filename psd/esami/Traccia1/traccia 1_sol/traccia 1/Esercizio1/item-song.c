#include <stdio.h>
#include <stdlib.h>
#include "item.h"
#include "song.h"
#include <string.h>

Item inputItem(){
	printf("Non usare inputItem(). Non richiedere input da tastiera.\n");
	return initSong("titolo di prova", "artista di prova", 120, 11);
}

void outputItem(Item item){
	Song s = item;
	printf("\n%s - %s (%d sec.), gradimento: %d", artist(s), title(s), duration(s), gradimento(s));
}

int cmpItem(Item item1, Item item2){
	Song s1 = item1;
	Song s2 = item2;
	return strcmp(title(s1), title(s2));
}
