FROM centos:7.6.1810

RUN yum install -y https://download.postgresql.org/pub/repos/yum/11/redhat/rhel-7-x86_64/pgdg-centos11-11-2.noarch.rpm
RUN yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
RUN yum install epel-release -y \
    && yum update -y \
    && yum install --setopt=skip_missing_names_on_install=False -y \
    postgresql11 awscli docker-ce-cli less curl jq \
    && yum clean all

RUN curl -o /usr/bin/slack \
    https://raw.githubusercontent.com/rockymadden/slack-cli/46d22741e82d749180ae91512515132a9380ad57/src/slack \
    && chmod 755 /usr/bin/slack
COPY bashrc /root/.bashrc
WORKDIR /root

COPY notify_if_fails /usr/bin/

CMD ["/bin/bash","-l"]
