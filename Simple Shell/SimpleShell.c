#include <stdio.h>
#include <unistd.h>


int main(void)
{
	int status;
	char *input[4];
	char *cmd;

	while(1)
	{
		printf("Put command here: \n");
		gets(input);
		*cmd = input[0];
		if(fork != 0)
		{
			waitpid(-1, &status, 0);
		}
		else
		{
			execvp(cmd, input);
		}
	}


	return 0;
}