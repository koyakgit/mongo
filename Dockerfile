# For development by VSCode

# Base image is ubuntu
FROM mongo:4.2-bionic
LABEL Name=FRONTEO Version=0.0.1

# Localize
RUN apt update && apt upgrade -y && \
    apt install -y language-pack-ja-base language-pack-ja ibus-mozc && \
    echo 'export LANG=ja_JP.UTF-8' >> ~/.bashrc && \
    echo 'export LANGUAGE="ja_JP:ja"' >> ~/.bashrc
ENV TZ=Asia/Tokyo LANG=ja_JP.UTF-8 LANGUAGE=ja_JP:ja LC_ALL=ja_JP.UTF-8

# mongodb auth
COPY ./Dockerfiles/mongod-keyfile /etc/mongod-keyfile
RUN chown mongodb:mongodb /etc/mongod-keyfile
RUN chmod 600 /etc/mongod-keyfile

EXPOSE 27017 27018 27019
