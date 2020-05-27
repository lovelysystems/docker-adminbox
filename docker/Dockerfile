FROM centos:7.7.1908

RUN yum install -y https://download.postgresql.org/pub/repos/yum/reporpms/EL-7-x86_64/pgdg-redhat-repo-latest.noarch.rpm \
    && yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo \
    && yum install epel-release -y \
    && yum update -y \
    && yum install -y --setopt=skip_missing_names_on_install=False \
    postgresql12 mysql awscli docker-ce-cli less curl jq mtr \
    && yum clean all

RUN curl -o /usr/bin/slack \
    https://raw.githubusercontent.com/rockymadden/slack-cli/46d22741e82d749180ae91512515132a9380ad57/src/slack \
    && chmod 755 /usr/bin/slack
COPY bashrc /root/.bashrc
WORKDIR /root

COPY notify_if_fails /usr/bin/

CMD ["/bin/bash","-l"]
