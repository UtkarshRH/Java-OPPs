class FAndLdigit{
	int findFdigitAndLdigit(int n){
		int last = n%10;
		int first = 0;
		while(n!=10){
			first = n % 10;
			n/=10;
		}
		first*=10;
		first+=last;
		return first;
	}
}