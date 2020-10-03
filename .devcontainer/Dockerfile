# See here for image contents: https://github.com/microsoft/vscode-dev-containers/tree/v0.140.1/containers/alpine/.devcontainer/base.Dockerfile

# [Choice] Alpine version: 3.12, 3.11, 3.10
ARG VARIANT="3.12"
FROM mcr.microsoft.com/vscode/devcontainers/base:0-alpine-${VARIANT}

ADD https://cdn.azul.com/public_keys/alpine-signing@azul.com-5d5dc44c.rsa.pub /etc/apk/keys/
RUN echo "https://repos.azul.com/zulu/alpine" >> /etc/apk/repositories
# ** [Optional] Uncomment this section to install additional packages. **
RUN apk update
RUN apk upgrade
RUN apk add --update zulu15-jdk
RUN apk add --update ttf-dejavu
RUN apk add --update nodejs npm
RUN apk add rlwrap --repository=http://dl-cdn.alpinelinux.org/alpine/edge/testing
RUN curl -O https://download.clojure.org/install/linux-install-1.10.1.697.sh
RUN chmod +x linux-install-1.10.1.697.sh
RUN ./linux-install-1.10.1.697.sh