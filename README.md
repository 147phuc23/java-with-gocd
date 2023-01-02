# Java with go-cd for CD process

This is a demo project, using local environment to deploy

With trunk-based development, we have a pipeline like this

1. One master branch for every feature
2. Build jar file, with setting up **env params** 
3. Code run unit test
4. Deploy to testing environment, run integration test
5. Deploy to staging environment
6. Can manual deploy to production