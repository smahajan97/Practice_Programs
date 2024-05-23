#include<stdio.h>

double SqFeetToSqMeter(int iNo)
{
  float fResult = 0.0F;
  double SQFeet = 0.0929;
  
  fResult = iNo * SQFeet ;

  return fResult;
}

int main()
{
  int iValue = 0;
  double fRet = 0.0;

  printf("Enter area in Square Feet : ");
  scanf("%d", &iValue);

  fRet = SqFeetToSqMeter(iValue);
  printf("Area in Square Meter : %.8f", fRet);

  return 0;
}

