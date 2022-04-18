#!/usr/bin/zsh

minikube stop
minikube delete

minikube start \
  --kubernetes-version v1.21.2 \
  --mount \
  --mount-string ~/dataengineering/k8s/:/mnt/local/data/ \
  --network-plugin=cni \
  --cni calico \
  --embed-certs \
  --memory 32g \
  --cpus 8 \
  --disk-size 80g

minikube addons enable metrics-server
minikube dashboard