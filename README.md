# basic-java-app-2-helm-master

issue with docker for windows.. ignore persistence volume:
helm install --set persistence.enabled=false stable/postgresql

helm install --name docker-2-helm ./helm-chart/docker-2-helm


helm install --name keycloak-proxy -f keycloak/keycloak-values incubator/keycloak-proxy

