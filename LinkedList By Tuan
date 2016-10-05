#include<stdio.h>
#include<conio.h>
// khai bao cau truc du lieu danh sach lien ket don
struct Node
{
int Data;
struct Node* pNext;
};
typedef struct Node NODE;
struct List
{
NODE* pHead;
NODE* pTail;
};
typedef struct List LIST;
// khoi tao danh sach lien ket don
void Init(LIST &l)
{
l.pHead=l.pTail=NULL;
}
//tao node trong danh sach
NODE* GetNode(int x)
{
NODE *p = new NODE;
p->Data=x;// luu x vao data
p->pNext=NULL;// khoi tao moi lien ket
return p;
}
// them 2 node vao dau hoac cuoi
//them dau
void addHead(LIST &l,NODE* p)
{
if(l.pHead==NULL)
{
l.pHead=l.pTail=p;

}else
{
p->pNext=l.pHead;
l.pHead=p;
}
}
// nhap du lieu cho danh sach
void InPut(LIST &l)
{
int n;
printf("ban muon tao bao nhieu node");
scanf("%d",&n);
Init(l);//khoi tao danh sach 
for(int i=0;i<n;i++)
{
int x;
printf("nhap data node %d",i);
scanf("%d",&x);
NODE *p=GetNode(x);//dua data vao nodo p, tao ra node p
addHead(l,p);//them node p vao dau danh sach
}
} 
void OutPut(LIST l)
{
for(NODE *p=l.pHead;p!=NULL;p=p->pNext)
{
printf("%4d",p->Data);
}
}
int main()
{
LIST l;
InPut(l);
OutPut(l);
getch();
return 1;
}
