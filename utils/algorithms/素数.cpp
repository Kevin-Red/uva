bool is_pn(int num) {
	if (num == 2 || num == 3)
		return true;
	if (num % 6 != 1 && num % 6 != 5)
		return false;
	int tmp = sqrt(num); 
	for (int i = 5; i <= tmp; i += 6)
		if (num %i == 0 || num % (i + 2) == 0)
			return false;
	return true;
}
