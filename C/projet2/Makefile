NAME	=	project

CC	=	gcc

SRC	=	main.c

OBJ	=	$(SRC:.c=.o)

CFLAGS	+=	-W -Wall -Werror

LDFLAGS =

all:	$(NAME)

$(NAME): $(OBJ)
	 $(CC) -o $(NAME) $(OBJ) $(CFLAGS)

clean:
	rm -f $(OBJ)

fclean: clean
	rm -f $(NAME)

re: fclean all

.PHONY: all clean fclean re
