FROM store/oracle/serverjre:8

RUN echo -e "alias javac='javac -J-Dfile.encoding=UTF-8'\nalias java='java -Dfile.encoding=UTF-8'" > ~/.bash_profile

WORKDIR /home/app
COPY app /home/app
