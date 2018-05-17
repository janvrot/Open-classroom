Rails.application.routes.draw do

	root 'articles#index'

	# get 'articles/index'

	# get 'articles' => 'articles#index'
	# post 'articles' => 'articles#create'

	# get 'articles/:id' => 'articles#show'
	# patch 'articles/:id' => 'articles#update'
	# delete 'articles/:id' => 'articles#destroy'

	resources :articles, only: [:index, :create, :show, :update, :destroy]
	resources :comments, only: [:index, :create, :show, :update, :destroy]

	# post 'comments/:id' => 'comments#create'
	# get 'comments/:art_id/:com_id' => 'comments#destroy'

end
