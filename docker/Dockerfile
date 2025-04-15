FROM centos:7.9.2009

RUN yum install -y https://download.postgresql.org/pub/repos/yum/reporpms/EL-7-x86_64/pgdg-redhat-repo-latest.noarch.rpm \
    && yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo \
    && yum install epel-release -y \
    && yum update -y \
    && yum install -y --setopt=skip_missing_names_on_install=False \
    postgresql14 mysql python3-pip docker-ce-cli less curl jq mtr \
    && yum clean all && pip3 install awscli

COPY bashrc /root/.bashrc
WORKDIR /root

COPY notify_if_fails /usr/bin/

CMD ["/bin/bash","-l"]
