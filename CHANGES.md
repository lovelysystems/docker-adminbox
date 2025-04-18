# Changes for docker-adminbox

## 2025-04-15 / 1.1.0

### Feature

- upgrade aws cli from v1 to v2

## 2025-04-15 / 1.0.0

### Breaking

- switch `notify_if_fails` from deprecated slack bots to webhooks.

### Deployment

- remove env `SLACK_CLI_TOKEN` and add `SLACK_WEBHOOK` 

## 2023-03-28 / 0.5.0

### Feature

- slack channel for notify_if_fails can be configured via `SLACK_CHANNEL`

## 2022-08-31 / 0.4.2

- limit to amd64 builds (needs adaptions for arm support)

## 2022-08-31 / 0.4.1

- notify_if_fails now also notifies on errors in piped commands
  (eg `notify_if_fails 'pg_dumpall --break|gzip|aws s3 cp - s3://bucket/file.sql.gz'`)

### Develop

- Allow to build image on/for arm64 platforms
  - requires docker >v20.10 (error `unknown flag: --builder`)
  - first time call: `gw prepareDockerContainerBuilder` (see https://github.com/lovelysystems/lovely-gradle-plugin)

## 2022-08-30 / 0.4.0

- update centos to latest 7 version
- udpate postgres to version 14
- use python3 to install awscli as the
  standard package does not work anymore
- update gradle

## 2020-05-27 / 0.3.0

- added mysql client

## 2020-05-06 / 0.2.0

- centos 7.7
- postgres client version 12
- added mtr

## 2020-05-05 / 0.1.0

- initial release
