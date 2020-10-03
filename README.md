# Clojure in Docker

This repo sets up a Clojure/Clojure-js development environment for VS Code.

## Devcontainer

### Image (./.devcontainer/Dockerfile)

The image is based on Microsofts Alpine container and Adds the Azul Zulu15 JDK, ttf-dejavu (for Fontconfig stuff that Calva wants), rlwrap, [Clojure](https://clojure.org/), Nodejs and NPM.

### Plugins (./.devcontainer/devcontainer.json)

- [Calva](https://calva.io/)
- rainbow-brackets
- Cspell (with Swedish)
- Markdownlint

### Ports (./.devcontainer/devcontainer.json)

- 8080 (for external http access)
- 9630 (for shadow-cljs)

## Setup

The `package.json` contains a dev dependency on `shadow-cljs` and the `shadow-cljs.edn` sets up the `:app` build target that can be started by Calva and connected to.

Now [http://localhost:8080](http://localhost:8080) should be reachable.
