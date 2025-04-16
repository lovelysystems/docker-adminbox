FROM centos:7.9.2009
# centos images are deprecated and without recent updates

# see https://serverfault.com/questions/904304/could-not-resolve-host-mirrorlist-centos-org-centos-7
COPY CentOS-Base.repo /etc/yum.repos.d/CentOS-Base.repo

 # install epel-release repository first, so that jq can be installed from there
RUN yum install -y https://download.postgresql.org/pub/repos/yum/reporpms/EL-7-x86_64/pgdg-redhat-repo-latest.noarch.rpm \
    && yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo \
    && yum update -y \
    && yum install -y --setopt=skip_missing_names_on_install=False epel-release \
    && yum install -y --setopt=skip_missing_names_on_install=False \
    postgresql14 mysql python3-pip docker-ce-cli less curl jq mtr unzip \
    && yum clean all

RUN curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip"
RUN unzip awscliv2.zip
RUN ./aws/install

COPY bashrc /root/.bashrc
WORKDIR /root

COPY notify_if_fails /usr/bin/

CMD ["/bin/bash","-l"]
