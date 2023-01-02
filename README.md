# Java with go-cd for CD process

This is a demo project, using local environment to deploy

With trunk-based development, we have a pipeline like this

1. One master branch for every feature
2. Build jar file, with setting up **env params** 
3. Code run unit test
4. Deploy to testing environment, run integration test
5. Deploy to staging environment
6. Can manual deploy to production

## Docker cmd
All the docker image can be found in [here](!https://hub.docker.com/u/gocd)
### GoCD server
```shell
docker run -d -p8153:8153 gocd/gocd-server:v22.3.0
```

### GoCD agent

```shell
docker run --privileged -d -e GO_SERVER_URL="https://localhost:8153" gocd/gocd-agent-docker-dind:v22.3.0
```

or simply run this `docker-compose.yml`
```yml
go-server:
  image: gocd/gocd-server:v17.9.0
  ports:
    - '8153:8153'
    - '8154:8154'

goagent:
  image: gocd/gocd-agent-alpine-3.5:v17.9.0
  links:
    - go-server
  environment:
    GO_SERVER_URL: https://go-server:8154/go
```