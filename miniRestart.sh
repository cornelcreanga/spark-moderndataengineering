#!/bin/zsh

minikube stop
minikube delete

minikube start \
  --kubernetes-version v1.21.2 \
  --mount \
  --mount-string ~/dataengineering/k8s/:/mnt/local/data/ \
  --network-plugin=cni \
  --cni calico \
  --embed-certs \
  --memory 8g \
  --cpus 6 \
  --disk-size 80g

minikube addons enable metrics-server
minikube dashboard
