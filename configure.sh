DIR="/Users/ccreanga/projects/personal/spark-moderndataengineering"

cd $DIR/ch-15/intro-to-kubernetes/services
kubectl apply -f redis-service.yaml
cd $DIR/ch-15/intro-to-kubernetes
kubectl apply -f namespace.yaml

cd $DIR/ch-15/applications/redis-streams-k8s
sbt clean assembly
eval $(minikube docker-env)
docker build . -t mde/redis-streams-k8s:1.0.0
cd $DIR/ch-15/spark-on-kubernetes/spark-apps
kubectl apply -f namespace.yaml
kubectl apply -f spark-controller.yaml
kubectl apply -f redis-service-bridge.yaml
