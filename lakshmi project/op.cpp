#include<iostream>
#include<conio.h>
#include<ctime>
using namespace std;
class no
{
      int x;
      public:
      no(){}
      no(int n)
      {
             x=n;
      }
      void put()
      {
           cout<<x;
      }
      friend class game;
      friend no operator+(no a1,no a2); 
      friend no operator-(no a1,no a2);
      friend no operator*(no a1,no a2);
      friend no operator/(no a1,no a2);
};
      no operator+(no a1,no a2)  
      {
          no n;  
          n.x=a1.x+a2.x; 
          return n;  
       }  
      no operator-(no a1,no a2)  
      {  
          no n;  
          n.x=a1.x-a2.x; 
          return n;  
       }  
      no operator*(no a1,no a2)  
      {  
           no n;  
           n.x=a1.x*a2.x;  
           return n;  
       }  
      no operator/(no a1,no a2)  
      {  
           no n;  
           n.x=a1.x/a2.x; 
           return n;  
       }
         
class game
{
      no a,b,c1,c2;
      char op;
      public:
      void generator()
      {
           int o;
           a=rand()%50+1;
           b=rand()%50+1;
           o=rand()%4+1;
            switch(o)
            {
                     case 1:op='+';
                            break;
                     case 2:op='-';
                            break;
                     case 3:op='*';
                            break;
                     case 4:op='/';
                            break;
            }
      }
      int checker()
      {
           int ans;
           cout<<a.x<<op<<b.x<<"? \n";
           cin>>ans;
           c1=ans;
           int points=0;
           switch(op)
              {
                       case '+':c2=a+b;
	                            break;
                       case '-':c2=a-b;
	                            break;
                       case '*':c2=a*b;
	                            break;
                       case '/':c2=a/b;
	                            break;
              }
           if(c1.x==c2.x)
              points=1;
           return points;
          
      }
};
class tim
{
      int hr,sec,min;
      public:
             tim()
             {
                  hr=0;
                  min=0;
                  sec=0;
             }
           tim(int seconds)
           {
                   hr=0;
                   min=0;
                   sec=seconds;
           }
           tim operator - (tim t2)
           {
                tim temp;
                if(sec>t2.sec)
                    temp.sec=sec-t2.sec;
                else
                    temp.sec=t2.sec-sec;
                return temp;
           }
           void calculate()
           {
                if(sec>=60)
                {
                     min=sec/60;
                     sec%=60;
                }
                if(min>=60)
                {
                     hr=min/60;
                     min%=60;
                 }
           }
           void display()
            {
                cout<<hr<<" : "<<min<<" : "<<sec<<"\n";
            }
           int retsec()
           {
               return sec;
           }
};
int main()
{
      int p=0;
      int ch=1;
      int score,s=0;
      time_t end,start;
      double dif=0;
      game g;
      tim t_fixed(120),t_elapsed,t_left;
      tim timemin;
      while(p<50)
      {
      cout<<"\n Welcome...\n Arithmetic game...Press 1 to play..0 to exit";
      cin>>ch;
      if(ch==0)
      exit(0);
      int j=0;
      time(&start);
      while(j<10)
      {
            tim t1(start);
            g.generator();
            score=g.checker();
            j++;
            time(&end);
            tim t2(end);
            t_elapsed=t1-t2;
            t_left=t_fixed-t_elapsed;
            t_left.calculate();
            cout<<"\nTime left :";
            t_left.display();
            int m=t_elapsed.retsec();
            if(m==120) 
            {
               cout<<"\nTime up !  " ;
               getch();
               exit(0);
            }
            s=s+score;
      }
      time(&end);
      if(p==0)
          timemin=t_elapsed;
      p++;
      if(t_elapsed.retsec()<=timemin.retsec())
          timemin=t_elapsed;
      dif=difftime(end,start);
      cout<<"\n Congratulations..Your score:"<<s<<"Completed in"<<dif<<"seconds";
      cout<<"\nBest time : ";
      timemin.display();
      t_fixed=timemin;
      s=0;
      }
      getch();
}
      
            
            
            
            
      
