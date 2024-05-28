#include<stdio.h>

void DisplayPattern(int iRow, int iCol)
{
  int Row = 0, Col = 0;
  for(Row = 1 ; Row <= iRow ; Row++)
  {
     for(Col = iCol ; Col >= 1 ; Col--)
     {
      if(Row == Col)
      {
        printf("#\t");
      }
      else
      {
        printf("*\t");

      }
        
     }
     printf("\n");

  }
 
}

int main()
{
  int iValue1 = 0, iValue2 = 0;

  printf("Enter number of Rows and Columns : \n");
  scanf("%d %d", &iValue1, &iValue2);

  DisplayPattern(iValue1, iValue2);
  return 0;
}
/*
Enter number of Rows and Columns :
4
4
*       *       *       #
*       *       #       *
*       #       *       *
#       *       *       *
*/
