#include "list.h"
#include <stdlib.h>
#include <stdio.h>
#include "item.h"

struct list
{
    int size;
    struct node *head;
};

struct node
{
    Item value;
    struct node *next;
};

List newList()
{
    List l = malloc(sizeof(struct list));
    l->size = 0;
    l->head = NULL;
    return l;
}

int isEmpty(List l)
{
    if (l->size == 0)
        return 1;
    else
        return 0;
}

void addHead(List l, Item a)
{
    struct node *n = malloc(sizeof(struct node));
    n->next = l->head;
    n->value = a;
    l->head = n;
    l->size++;
}

Item removeHead(List l)
{
    if (isEmpty(l))
    {
        return NULL;
    }
    struct node *t = l->head;
    l->head = t->next;
    Item v = t->value;
    free(t);
    l->size--;
    return v;
}

Item getHead(List l)
{
    if (isEmpty(l))
    {
        return NULL;
    }
    return l->head->value;
}

int sizeList(List l)
{
    return l->size;
}

void printList(List l)
{
    struct node *p;
    for (p = l->head; p != NULL; p = p->next)
    {
        outputItem(p->value);
    }
}

Item searchListItem(List list, Item item, int *pos)
{
    struct node *p;
    *pos = 0;
    for (p = list->head; p != NULL; p = p->next)
    {
        if (cmpItem(item, p->value) == 0)
            return p->value;

        (*pos)++;
    }
    *pos = -1;
    return NULL;
}

Item removeListItem(List list, Item item)
{
	struct node *p;
	struct node *prev;
	if (isEmpty(list))
		return NULL;
	
	for (p = list->head; p != NULL; prev = p, p = p->next)
	{
		if (cmpItem(item, p->value) == 0)
		{
			if (p == list->head)
				return removeHead(list);
	
			prev->next = p->next;
			Item v = p->value;
			free(p);
			list->size--;
			return v;
		}
	}
	return NULL;
}
Item removeListPos(List list, int pos)
{
    struct node *p;
    struct node *prev;
    int count = 0;

    if (isEmpty(list) || pos < 0 || pos >= list->size)
        return NULL;

    for (p = list->head; p != NULL; prev = p, p = p->next, count++)
    {

        if (count == pos)
        {

            if (p == list->head)
                return removeHead(list);

            prev->next = p->next;
            Item v = p->value;
            free(p);
            list->size--;
            return v;
        }
    }
    return NULL;
}

int addListPos(List l, Item item, int pos){

    int i=0;
    struct node *p;

    if(pos<0 || pos>(l->size)) 
        return 0;

    if(pos==0){
        addHead(l,item);
        return 1;
    }

    for(p=l->head;p!=NULL && i<pos-1 ;i++,p=p->next);

    struct node *newNode=malloc(sizeof(struct node));
    newNode->value=item;
    newNode->next=p->next;

    p->next=newNode;

    l->size++;

    return 1;

}


int addListTail(List l, Item item){
    return addListPos(l,item, l->size);
}


void reverseList(List l){

    struct node *p, *prev=NULL, *temp;
    for(p=l->head; p!=NULL; prev=p, p=temp){

        temp=p->next;
        p->next=prev;

    }

    l->head=prev;

}

List cloneList(List l){

    List clone = newList();

    struct node *p;
    for(p=l->head; p!=NULL; p=p->next){
        addListTail(clone,p->value);
    }

    return clone;

}

List selectionSort(List l){
	struct node *p, *pos_minimo;
	
	for (p=l->head; p!=NULL; p=p->next)
	{
		pos_minimo = minimo(p);
		swap(&(pos_minimo->value), &(p->value));
	}
}

struct node *minimo (struct node *p){
	struct node *i, *min=p;
	
	for (i=p; i!=NULL; i=i->next)
	{
		if ((cmpItem(min->value, i->value)) > 0)
			min = i;
	}
	return min;
}

void swap(Item *a, Item *b){
	Item temp=*b;
	*b = *a;
	*a = temp;
}

void printNode(struct node *node){
	if (node == NULL)
		return;
	outputItem (node->value);
	printNode(node->next);
}

void printListRec(List list){
	printNode(list->head);
}

Item searchNode(struct node *node, Item item, int *pos){
	if (node == NULL)
	{
		*pos = -1;
		return NULL;
	}
	
	if(cmpItem(node->value, item) == 0)
		return node->value;
	
	else
	{
		++*pos;
		return searchNode(node->next, item, pos);
	}
}

Item searchListRec(List list, Item item, int *pos){
	*pos = 0;
	searchNode(list->head, item, pos);
}

int countNode(struct node *node, Item item){	
	if (node == NULL)
		return 0;
	
	if(cmpItem(node->value, item) == 0)
		return countNode(node->next, item) + 1;
	else
		countNode(node->next, item);
}

int countItemListRec(List list, Item item){
	countNode(list->head, item);
}

void destroyNode(List list, struct node *p){
	struct node *p1;
	
	if (p == NULL)
		return;
	
	p1 = p->next;
	free(p);
	list->size--;
	
	destroyNode(list, p1);
}

void destroyListRec(List list){
	destroyNode(list, list->head);
}