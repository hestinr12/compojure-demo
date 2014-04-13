(ns demo.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.middleware.json :as middleware]))




(defroutes app-routes
  (GET "/" [] "POST to ~/demo and it'll print out the body (do it as application/json pls :D)")
  (POST "/demo" {params :body} (str params "\n"))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (handler/site app-routes)
  		middleware/wrap-json-body))
